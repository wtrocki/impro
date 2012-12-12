package com.matlab.eclipse.meditor.editors;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;

/**
 * Helper class for match pairs of characters.
 */
public final class JavaPairMatcher extends DefaultCharacterPairMatcher {

    /**
     * Stores the source version state.
     * 
     * @since 3.1
     */
    private boolean fHighlightAngularBrackets = false;

    public JavaPairMatcher(char[] pairs) {
	super(pairs);
    }

    /* @see ICharacterPairMatcher#match(IDocument, int) */
    @Override
    public IRegion match(IDocument document, int offset) {
	try {
	    return performMatch(document, offset);
	} catch (BadLocationException ble) {
	    return null;
	}
    }

    /*
     * Performs the actual work of matching for #match(IDocument, int).
     */
    private IRegion performMatch(IDocument document, int offset)
	    throws BadLocationException {
	if (offset < 0 || document == null)
	    return null;
	final char prevChar = document.getChar(Math.max(offset - 1, 0));
	if ((prevChar == '<' || prevChar == '>') && !fHighlightAngularBrackets)
	    return null;
	if (prevChar == '<' && isLessThanOperator(document, offset - 1))
	    return null;
	final IRegion region = super.match(document, offset);
	if (region == null)
	    return region;
	if (prevChar == '>') {
	    final int peer = region.getOffset();
	    if (isLessThanOperator(document, peer))
		return null;
	}
	return region;
    }

    /**
     * Returns true if the character at the specified offset is a less-than
     * sign, rather than an type parameter list open angle bracket.
     * 
     * @param document
     *            a document
     * @param offset
     *            an offset within the document
     * @return true if the character at the specified offset is not a type
     *         parameter start bracket
     * @throws BadLocationException
     */
    private boolean isLessThanOperator(IDocument document, int offset)
	    throws BadLocationException {
	if (offset < 0)
	    return false;
	return !isTypeParameterBracket(offset, document);
    }

    /**
     * Checks if the angular bracket at <code>offset</code> is a type parameter
     * bracket.
     * 
     * @param offset
     *            the offset of the opening bracket
     * @param document
     *            the document
     * @param scanner
     *            a java heuristic scanner on <code>document</code>
     * @return <code>true</code> if the bracket is part of a type parameter,
     *         <code>false</code> otherwise
     * @since 3.1
     */
    private boolean isTypeParameterBracket(int offset, IDocument document) {
	/*
	 * type parameter come after braces (closing or opening), semicolons, or
	 * after a Type name (heuristic: starts with capital character, or after
	 * a modifier keyword in a method declaration (visibility, static,
	 * synchronized, final)
	 */

	return false;
    }

    public void setSourceVersion(String version) {
	fHighlightAngularBrackets = true;
    }
}
