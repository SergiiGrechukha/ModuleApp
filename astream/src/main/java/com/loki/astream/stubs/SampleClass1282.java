package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1282 {

    @Ignore    private SampleClass1283 sampleClass;

    public SampleClass1282(){
        sampleClass = new SampleClass1283();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}