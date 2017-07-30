package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass962 {

    @Ignore    private SampleClass963 sampleClass;

    public SampleClass962(){
        sampleClass = new SampleClass963();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}