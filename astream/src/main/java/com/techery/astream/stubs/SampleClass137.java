package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass137 {

    @Ignore    private SampleClass138 sampleClass;

    public SampleClass137(){
        sampleClass = new SampleClass138();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}