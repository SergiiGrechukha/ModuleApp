package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass404 {

    @Ignore    private SampleClass405 sampleClass;

    public SampleClass404(){
        sampleClass = new SampleClass405();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}