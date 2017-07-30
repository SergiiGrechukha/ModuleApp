package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass933 {

    @Ignore    private SampleClass934 sampleClass;

    public SampleClass933(){
        sampleClass = new SampleClass934();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}