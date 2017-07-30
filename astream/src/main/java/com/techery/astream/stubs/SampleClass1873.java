package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1873 {

    @Ignore    private SampleClass1874 sampleClass;

    public SampleClass1873(){
        sampleClass = new SampleClass1874();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}