package com.oxygenxml.resources.batch.converter.converters;

/**
 * Converter implementation for HTML to Docbook4.
 * 
 * @author cosmin_duna
 */
public class HtmlToDocbook4Converter extends PipelineConverter {

  /**
   * Get the converters used in HTML to DocBook4 conversion.
   */
  @Override
  protected Converter[] getUsedConverters() {
    return new Converter[] {
        new HtmlToXhtmlConverter(),
        new HTML5Cleaner(),
        new XHTMLToDocbook4Converter()
    };
  }
}
