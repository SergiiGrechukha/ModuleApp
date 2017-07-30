package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1158 {

    @Ignore    private SampleClass1159 sampleClass;

    public SampleClass1158(){
        sampleClass = new SampleClass1159();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}