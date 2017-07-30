package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass384 {

    @Ignore    private SampleClass385 sampleClass;

    public SampleClass384(){
        sampleClass = new SampleClass385();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}