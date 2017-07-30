package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1825 {

    @Ignore    private SampleClass1826 sampleClass;

    public SampleClass1825(){
        sampleClass = new SampleClass1826();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}