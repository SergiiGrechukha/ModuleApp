package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1333 {

    @Ignore    private SampleClass1334 sampleClass;

    public SampleClass1333(){
        sampleClass = new SampleClass1334();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}