package com.oxygenxml.resources.batch.converter.converters;

import java.io.File;
import java.io.Reader;

import javax.xml.transform.TransformerException;

import com.oxygenxml.resources.batch.converter.trasformer.TransformerFactoryCreator;

/**
 * Interface for convert a document in other type.
 * 
 * @author Cosmin Duna
 *
 */
public interface Converter {

	/**
	 * Convert the given file in other type.
	 * 
	 * @param originalFile
	 *          The File to convert.
	 * @param contentReader
	 *          Reader of the document. If the content reader isn't <code>null</code>, 
	 *          the converter will process this reader and will ignore the given file.
	 * @param baseDir 
	 * 					The base directory.
	 * @param transformerCreator
	 *          A transformer creator.
	 * @return The converted content in String format.
	 * @throws TransformerException
	 */
	public ConversionResult convert(File originalFile, Reader contentReader, File baseDir, TransformerFactoryCreator transformerCreator)
			throws TransformerException;
}
