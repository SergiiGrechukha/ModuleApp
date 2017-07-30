package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1542 {

    @Ignore    private SampleClass1543 sampleClass;

    public SampleClass1542(){
        sampleClass = new SampleClass1543();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}