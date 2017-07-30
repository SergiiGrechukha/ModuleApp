package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1904 {

    @Ignore    private SampleClass1905 sampleClass;

    public SampleClass1904(){
        sampleClass = new SampleClass1905();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}