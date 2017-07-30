package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1854 {

    @Ignore    private SampleClass1855 sampleClass;

    public SampleClass1854(){
        sampleClass = new SampleClass1855();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}