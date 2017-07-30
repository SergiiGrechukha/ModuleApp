package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1543 {

    @Ignore    private SampleClass1544 sampleClass;

    public SampleClass1543(){
        sampleClass = new SampleClass1544();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}