package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1146 {

    @Ignore    private SampleClass1147 sampleClass;

    public SampleClass1146(){
        sampleClass = new SampleClass1147();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}