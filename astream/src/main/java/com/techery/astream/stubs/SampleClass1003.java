package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1003 {

    @Ignore    private SampleClass1004 sampleClass;

    public SampleClass1003(){
        sampleClass = new SampleClass1004();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}