package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1334 {

    @Ignore    private SampleClass1335 sampleClass;

    public SampleClass1334(){
        sampleClass = new SampleClass1335();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}