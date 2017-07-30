package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1915 {

    @Ignore    private SampleClass1916 sampleClass;

    public SampleClass1915(){
        sampleClass = new SampleClass1916();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}