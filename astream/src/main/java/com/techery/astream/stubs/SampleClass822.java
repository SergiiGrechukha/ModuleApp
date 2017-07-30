package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass822 {

    @Ignore    private SampleClass823 sampleClass;

    public SampleClass822(){
        sampleClass = new SampleClass823();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}