package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1906 {

    @Ignore    private SampleClass1907 sampleClass;

    public SampleClass1906(){
        sampleClass = new SampleClass1907();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}