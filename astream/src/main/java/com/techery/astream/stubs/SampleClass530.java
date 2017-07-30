package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass530 {

    @Ignore    private SampleClass531 sampleClass;

    public SampleClass530(){
        sampleClass = new SampleClass531();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}