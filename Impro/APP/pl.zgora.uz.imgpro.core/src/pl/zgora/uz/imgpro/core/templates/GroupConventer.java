package pl.zgora.uz.imgpro.core.templates;

import pl.zgora.uz.imgpro.model.diagram.*;
import pl.zgora.uz.imgpro.core.templates.TemplateHelper;
import pl.zgora.uz.imgpro.core.transformation.InvocationChain;
import java.util.*;

public class GroupConventer
{
  protected static String nl;
  public static synchronized GroupConventer create(String lineSeparator)
  {
    nl = lineSeparator;
    GroupConventer result = new GroupConventer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "classdef GroupConventer < handle" + NL + "    methods(Static)" + NL + "        function value = performConversion(groupName)" + NL + "        %% Lists all known features group and performs conversion to order number" + NL + "           switch groupName % gives a number for each diagnosis, it's for classification purposes";
  protected final String TEXT_2 = NL + "                case '";
  protected final String TEXT_3 = "'; value = ";
  protected final String TEXT_4 = ";";
  protected final String TEXT_5 = NL + "                otherwise; error(['Unknown classification group: ' groupName]);" + NL + "           end" + NL + "        end" + NL + "    end" + NL + "end";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
      @SuppressWarnings("unchecked")
   List<InvocationChain> invocationsChains=(List<InvocationChain>)argument;
   List<ExtractFeatures> features=TemplateHelper.getUniqueFeatures(invocationsChains);
    stringBuffer.append(TEXT_1);
     for(int i=0;i<features.size();i++) {
    stringBuffer.append(TEXT_2);
    stringBuffer.append(features.get(i).getClassificationGroup() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_4);
     } 
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
