package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1122 {

    @Ignore    private SampleClass1123 sampleClass;

    public SampleClass1122(){
        sampleClass = new SampleClass1123();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}