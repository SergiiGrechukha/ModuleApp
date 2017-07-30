package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass707 {

    @Ignore    private SampleClass708 sampleClass;

    public SampleClass707(){
        sampleClass = new SampleClass708();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}