package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1012 {

    @Ignore    private SampleClass1013 sampleClass;

    public SampleClass1012(){
        sampleClass = new SampleClass1013();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}