package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1841 {

    @Ignore    private SampleClass1842 sampleClass;

    public SampleClass1841(){
        sampleClass = new SampleClass1842();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}