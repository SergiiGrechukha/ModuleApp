package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1646 {

    @Ignore    private SampleClass1647 sampleClass;

    public SampleClass1646(){
        sampleClass = new SampleClass1647();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}