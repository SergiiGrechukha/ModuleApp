package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1128 {

    @Ignore    private SampleClass1129 sampleClass;

    public SampleClass1128(){
        sampleClass = new SampleClass1129();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}