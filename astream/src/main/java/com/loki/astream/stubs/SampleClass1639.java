package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1639 {

    @Ignore    private SampleClass1640 sampleClass;

    public SampleClass1639(){
        sampleClass = new SampleClass1640();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}