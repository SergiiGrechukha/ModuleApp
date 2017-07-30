package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1823 {

    @Ignore    private SampleClass1824 sampleClass;

    public SampleClass1823(){
        sampleClass = new SampleClass1824();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}