package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1145 {

    @Ignore    private SampleClass1146 sampleClass;

    public SampleClass1145(){
        sampleClass = new SampleClass1146();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}