package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1095 {

    @Ignore    private SampleClass1096 sampleClass;

    public SampleClass1095(){
        sampleClass = new SampleClass1096();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}