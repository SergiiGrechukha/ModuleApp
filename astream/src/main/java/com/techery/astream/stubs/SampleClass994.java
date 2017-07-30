package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass994 {

    @Ignore    private SampleClass995 sampleClass;

    public SampleClass994(){
        sampleClass = new SampleClass995();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}