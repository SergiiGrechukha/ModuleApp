package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass877 {

    @Ignore    private SampleClass878 sampleClass;

    public SampleClass877(){
        sampleClass = new SampleClass878();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}