package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1056 {

    @Ignore    private SampleClass1057 sampleClass;

    public SampleClass1056(){
        sampleClass = new SampleClass1057();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}