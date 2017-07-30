package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1091 {

    @Ignore    private SampleClass1092 sampleClass;

    public SampleClass1091(){
        sampleClass = new SampleClass1092();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}