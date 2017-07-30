package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1818 {

    @Ignore    private SampleClass1819 sampleClass;

    public SampleClass1818(){
        sampleClass = new SampleClass1819();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}