package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1107 {

    @Ignore    private SampleClass1108 sampleClass;

    public SampleClass1107(){
        sampleClass = new SampleClass1108();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}