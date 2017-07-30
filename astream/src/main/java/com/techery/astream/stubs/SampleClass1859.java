package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1859 {

    @Ignore    private SampleClass1860 sampleClass;

    public SampleClass1859(){
        sampleClass = new SampleClass1860();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}