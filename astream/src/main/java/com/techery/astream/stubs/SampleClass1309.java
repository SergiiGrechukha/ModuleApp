package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1309 {

    @Ignore    private SampleClass1310 sampleClass;

    public SampleClass1309(){
        sampleClass = new SampleClass1310();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}