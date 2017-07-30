package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1058 {

    @Ignore    private SampleClass1059 sampleClass;

    public SampleClass1058(){
        sampleClass = new SampleClass1059();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}