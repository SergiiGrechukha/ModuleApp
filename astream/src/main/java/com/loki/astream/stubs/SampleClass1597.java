package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1597 {

    @Ignore    private SampleClass1598 sampleClass;

    public SampleClass1597(){
        sampleClass = new SampleClass1598();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}