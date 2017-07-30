package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1855 {

    @Ignore    private SampleClass1856 sampleClass;

    public SampleClass1855(){
        sampleClass = new SampleClass1856();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}