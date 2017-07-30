package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass234 {

    @Ignore    private SampleClass235 sampleClass;

    public SampleClass234(){
        sampleClass = new SampleClass235();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}