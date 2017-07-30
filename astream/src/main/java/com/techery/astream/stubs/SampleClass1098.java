package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1098 {

    @Ignore    private SampleClass1099 sampleClass;

    public SampleClass1098(){
        sampleClass = new SampleClass1099();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}