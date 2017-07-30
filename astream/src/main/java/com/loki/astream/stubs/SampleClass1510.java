package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1510 {

    @Ignore    private SampleClass1511 sampleClass;

    public SampleClass1510(){
        sampleClass = new SampleClass1511();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}