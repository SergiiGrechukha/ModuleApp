package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1044 {

    @Ignore    private SampleClass1045 sampleClass;

    public SampleClass1044(){
        sampleClass = new SampleClass1045();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}