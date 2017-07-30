package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1592 {

    @Ignore    private SampleClass1593 sampleClass;

    public SampleClass1592(){
        sampleClass = new SampleClass1593();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}