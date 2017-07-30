package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1336 {

    @Ignore    private SampleClass1337 sampleClass;

    public SampleClass1336(){
        sampleClass = new SampleClass1337();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}