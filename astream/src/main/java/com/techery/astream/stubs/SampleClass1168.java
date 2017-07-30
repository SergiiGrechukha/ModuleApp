package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1168 {

    @Ignore    private SampleClass1169 sampleClass;

    public SampleClass1168(){
        sampleClass = new SampleClass1169();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}