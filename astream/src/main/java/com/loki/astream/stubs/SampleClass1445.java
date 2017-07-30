package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1445 {

    @Ignore    private SampleClass1446 sampleClass;

    public SampleClass1445(){
        sampleClass = new SampleClass1446();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}