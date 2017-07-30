package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1057 {

    @Ignore    private SampleClass1058 sampleClass;

    public SampleClass1057(){
        sampleClass = new SampleClass1058();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}